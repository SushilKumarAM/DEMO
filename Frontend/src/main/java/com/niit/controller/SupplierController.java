package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;

@Controller
public class SupplierController {
	
	@Autowired 
	SupplierDAO supplierDAO;
	@RequestMapping("/supplier")
	public String showSupplier(Model m)
	{
		List<Supplier> listSuppliers=supplierDAO.listSuppliers();
		m.addAttribute("supplierList",listSuppliers);
		
		return "Supplier";
	}
	
	@RequestMapping(value="/InsertSupplier",method=RequestMethod.POST)
	public String addSupplier(@RequestParam("supplrname")String supplrname,@RequestParam("supplraddress")String supplrAddress, Model m)
	{
		System.out.println("Supplier Name:"+supplrname);
		System.out.println("Supplier Address:"+supplrAddress);
		
		Supplier supplier=new Supplier();
		supplier.setSupplierName(supplrname);
		supplier.setSupplierAddress(supplrAddress);
		
		supplierDAO.addSupplier(supplier);
		
		List<Supplier> listSuppliers=supplierDAO.listSuppliers();
		m.addAttribute("supplierList",listSuppliers);
		
		return "Supplier";
	}
	
	@RequestMapping("/deleteSupplier/{supplierId}")
	public String deleteSupplier(@PathVariable("supplierId")int supplierId, Model m)
	{
		
		Supplier supplier=(Supplier)supplierDAO.getSupplier(supplierId);
		supplierDAO.deleteSupplier(supplier);
		
		List<Supplier> listSuppliers=supplierDAO.listSuppliers();
		m.addAttribute("supplierList",listSuppliers);
		return "Supplier";
	}
	
	@RequestMapping("/editSupplier/{supplierId}")
	public String editSupplier(@PathVariable("supplierId")int supplierId, Model m)
	{
		
		Supplier supplier=(Supplier)supplierDAO.getSupplier(supplierId);
		
		List<Supplier> listSuppliers=supplierDAO.listSuppliers();
		m.addAttribute("supplierList",listSuppliers);
		m.addAttribute("supplierInfo",supplier);
		return "UpdateSupplier";
	}
	
	@RequestMapping(value="/updateSupplier",method=RequestMethod.POST)
	public String updateSupplier(@RequestParam("supplrid")int supplierId,@RequestParam("supplrname")String supplrname,@RequestParam("supplraddress")String supplrAddress, Model m)
	{

		Supplier supplier=(Supplier)supplierDAO.getSupplier(supplierId);
		supplier.setSupplierName(supplrname);
		supplier.setSupplierAddress(supplrAddress);
		
		supplierDAO.updateSupplier(supplier);
		List<Supplier> listSuppliers=supplierDAO.listSuppliers();
		m.addAttribute("supplierList",listSuppliers);
		
		return "Supplier";
	}

}
