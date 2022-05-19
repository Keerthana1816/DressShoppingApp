package com.dressshoppingapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewDressitemsTest {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		items();
		items1();
	}

	public static void view() throws Exception {

		List<Dressitems> dress = new ArrayList<Dressitems>();
		dress = ViewDressitems.showAll();

		show(dress);
	}

	public static void items() throws Exception {
		System.out.println("Enter the DressName:");
		String dressName = sc.next();
		List<Dressitems> dressname = new ArrayList<Dressitems>();
		dressname = ViewDressitems.DressName(dressName);
		categories(dressname);

	}

	public static void items1() throws Exception {
		System.out.println("Enter the BrandName:");
		String brandName = sc.next();
		List<Dressitems> brandname = new ArrayList<Dressitems>();
		brandname = ViewDressitems.BrandName(brandName);
		categories1(brandname);

	}

	public static void show(List<Dressitems> dress) {
		System.out.println("dressIdNo  dressName  brandName  colour  price");
		for (Dressitems i : dress) {
			System.out.println(i.getDressIdNo() + "\t\t" + i.getDressName() + "\t" + i.getBrandName() + "\t"
					+ i.getColour() + "\t" + i.getPrice());
		}
	}

	public static void categories(List<Dressitems> dressname) {
		for (Dressitems i : dressname) {
			System.out.println(i.getDressIdNo() + "\t\t" + i.getDressName() + "\t" + i.getBrandName() + "\t"
					+ i.getColour() + "\t" + i.getPrice());
		}

	}

	public static void categories1(List<Dressitems> brandname) {
		for (Dressitems i : brandname) {
			System.out.println(i.getDressIdNo() + "\t\t" + i.getDressName() + "\t" + i.getBrandName() + "\t"
					+ i.getColour() + "\t" + i.getPrice());
		}

	}
}
