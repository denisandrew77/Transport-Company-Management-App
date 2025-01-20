package ro.denicar.controler;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ro.denicar.companii.dao.CompaniiDAO;
import ro.denicar.companii.pojo.Companie;

@Controller
public class CompaniiControler {
	@GetMapping("/companii")
	public ModelAndView getAll() throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("/Companii.jsp");
		ArrayList<Companie> companii = CompaniiDAO.getAll();
		mav.addObject("companii",companii);
		return mav;
	}
	@GetMapping("/companie")
	public ModelAndView getById(@RequestParam String companyName) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("/Companie.jsp");
		Companie companie = CompaniiDAO.getById(companyName);
		mav.addObject("companie",companie);
		return mav;
	}
	@GetMapping("/companie/create")
	public ModelAndView create() {
		ModelAndView mav = new ModelAndView("/CreateCompanie.jsp");
		Companie companie = new Companie();
		mav.addObject("companie",companie);
		return mav;
	}
	@PostMapping("/companie/save")
	public ModelAndView save(Companie companie) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("redirect:/companii");
		CompaniiDAO.create(companie);
		return mav;
	}
	@GetMapping("/companie/update")
	public ModelAndView update(String companyName) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("/UpdateCompanie.jsp");
		Companie companie = CompaniiDAO.getById(companyName);
		mav.addObject("companie",companie);
		return mav;
	}
	@PostMapping("/companie/update")
	public ModelAndView saveUpdate(Companie companie) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("redirect:/companii");
		CompaniiDAO.update(companie);
		return mav;
	}
	@GetMapping("/companie/delete")
	public ModelAndView delete(@RequestParam String companyName) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("redirect:/companii");
		CompaniiDAO.delete(companyName);
		return mav;
	}
	
}
