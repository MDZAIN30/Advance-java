package com.zrude.Controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.zrude.dao.productdao;
import com.zrude.entities.Product;

@Controller
public class Maincontoller {
	
	@Autowired
	private productdao productdao;
	
	@RequestMapping("/")
	public String home(Model m) {
		
		List<Product> getallpr=this.productdao.getAllProducts();
		
		m.addAttribute("product", getallpr);
	
		
		return "index";
	}
	
	
	@RequestMapping(value = "/update-product" ,method = RequestMethod.POST)

	public String updateProduct(@ModelAttribute Product product, HttpServletRequest req) {

	    // Call the update method to save the updated product details

	    productdao.updateProduct(product);

	    

	    // Redirect to a confirmation page or back to the product list

	    return "redirect:/"; // Adjust to your needs

	}


	
	
	@RequestMapping("/add-product")
	public String addproduct(Model m)
	{	
		m.addAttribute("title","You will Earn 28LPA");
		
		return "add_product_form";
	}
	
	
	@RequestMapping(value = "/handle-product" ,method = RequestMethod.POST)
	public RedirectView handler( @ModelAttribute Product product,HttpServletRequest request)
	
	{
		
		System.out.println(product);
		
		productdao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		
		redirectView.setUrl( request.getContextPath()+"/");
		return redirectView;
		
	}

	@RequestMapping("/delete/{productID}")
	public RedirectView delete(@PathVariable("productID") int pid,HttpServletRequest request)
	{
		
		
		this.productdao.deleteproduct(pid);

		RedirectView redirectView = new RedirectView();

		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;

	}
	
	@GetMapping("/update/{productID}")
	public String showUpdateForm(@PathVariable("productID") int pid, Model model) {
	    // Retrieve the product details
	    Product product = productdao.getProduct(pid);
	    
	    // Add the product to the model
	    model.addAttribute("product", product);
	    
	    // Return the view name for the update form
	    return "update"; // JSP page for the form
	}	
	
}
