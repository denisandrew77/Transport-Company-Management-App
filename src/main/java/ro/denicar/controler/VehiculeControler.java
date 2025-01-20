package ro.denicar.controler;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ro.denicar.vehicule.dao.VehiculeDAO;
import ro.denicar.vehicule.pojo.Vehicul;

@Controller
public class VehiculeControler {

	@GetMapping("/vehicule")
	public ModelAndView getVehicule() throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("Vehicule.jsp");
		ArrayList<Vehicul> vehicule = VehiculeDAO.getAll();
		mav.addObject("vehicule",vehicule);
		return mav;
	}
	@GetMapping("/vehicul")
	public ModelAndView getVehicul(@RequestParam String plate) throws ClassNotFoundException, SQLException {
		Vehicul vehicul = VehiculeDAO.getById(plate);
		ModelAndView mav = new ModelAndView("/Vehicul.jsp");
		mav.addObject("vehicul",vehicul);
		return mav;
	}
	@GetMapping("/vehicule/create")
	public ModelAndView createVehicul() throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("/CreateVehicul.jsp");
		Vehicul vehicul = new Vehicul();
		mav.addObject("vehicul",vehicul);
		return mav;
	}
	@PostMapping("/vehicule/save")
	public ModelAndView saveVehicul(Vehicul vehicul) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("redirect:/vehicule");
		VehiculeDAO.createVehicul(vehicul);
		return mav;
	}
	@GetMapping("/vehicul/update")
	public ModelAndView updateVehicul(@RequestParam String plate) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("/UpdateVehicul.jsp");
		Vehicul vehicul = VehiculeDAO.getById(plate);
		mav.addObject("vehicul",vehicul);
		return mav;
	}
	@PostMapping("/vehicul/update")
	public ModelAndView saveUpdateVehicul(Vehicul vehicul) throws ClassNotFoundException, SQLException {
		VehiculeDAO.updateVehicul(vehicul);
		ModelAndView mav = new ModelAndView("redirect:/vehicule");
		return mav;
	}
	
	@GetMapping("/vehicul/delete")
	public ModelAndView saveUpdateVehicul(@RequestParam String plate) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("redirect:/vehicule");
		VehiculeDAO.delete(plate);
		return mav;
	}
}
