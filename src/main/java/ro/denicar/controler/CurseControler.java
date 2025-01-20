package ro.denicar.controler;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ro.denicar.curse.dao.CurseDAO;
import ro.denicar.curse.pojo.Cursa;

@Controller
public class CurseControler {
	@GetMapping("/cursa")
	public ModelAndView cursa(@RequestParam int orderNumber) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("Cursa.jsp");
		Cursa c = CurseDAO.getById(orderNumber);
		mav.addObject("cursa", c);
		return mav;
	}
	@GetMapping("/curse")
	public ModelAndView curse() throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("Curse.jsp");
		ArrayList<Cursa> curse = CurseDAO.getAll();
		mav.addObject("curse", curse);
		return mav;
	}
	@GetMapping("/curse/edit")
	public ModelAndView updateCursa(@RequestParam int orderNumber) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("/UpdateCursa.jsp");
		Cursa cursa = CurseDAO.getById(orderNumber);
		mav.addObject("cursa",cursa);
		return mav;
	}
	@PostMapping("/curse/edit")
	public ModelAndView saveUpdateCursa(@ModelAttribute("cursa") Cursa c) throws ClassNotFoundException, SQLException {
		CurseDAO.update(c);
		ModelAndView mav = new ModelAndView("redirect:/curse");
		return mav;
	}
	@GetMapping("/curse/create")
	public ModelAndView createCursa() {
		ModelAndView mav = new ModelAndView("/CreateCursa.jsp");
		Cursa cursa = new Cursa();
		mav.addObject("cursa",cursa);
		return mav;
	}
	@PostMapping("/curse/saveCursa")
	public ModelAndView saveCursa(Cursa cursa) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("redirect:/curse");
		CurseDAO.create(cursa);
		return mav;
	}
	@GetMapping("/curse/deleteCursa")
	public ModelAndView deleteCursa(@RequestParam int orderNumber) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("redirect:/curse");
		CurseDAO.delete(orderNumber);
		return mav;
	}
	
}