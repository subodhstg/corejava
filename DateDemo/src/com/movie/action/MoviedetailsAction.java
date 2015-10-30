package com.movie.action;

import com.movie.dao.MoviedetailsDao;
import com.movie.model.Moviedetails;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MoviedetailsAction extends ActionSupport implements
		ModelDriven<Moviedetails> {
	MoviedetailsDao moviedao=new MoviedetailsDao();
	Moviedetails movies = new Moviedetails();

	@Override
	public Moviedetails getModel() {

		return movies;
	}

	public String save() throws Exception {
		System.out.println("In Action");
		System.out.println(movies);
		System.out.println("Out Action");
		moviedao.save(movies);
		return SUCCESS;
	}
}
