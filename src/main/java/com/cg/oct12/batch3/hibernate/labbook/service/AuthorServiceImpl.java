package com.cg.oct12.batch3.hibernate.labbook.service;

import com.cg.oct12.batch3.hibernate.labbook.dao.AuthorDao;
import com.cg.oct12.batch3.hibernate.labbook.dao.AuthorDaoImpl;
import com.cg.oct12.batch3.hibernate.labbook.entities.Author;

public class AuthorServiceImpl implements AuthorService {

	private AuthorDao dao;

	public AuthorServiceImpl() {
		dao = new AuthorDaoImpl();
	}

	@Override
	public void addAuthor(Author author) {
		dao.beginTransaction();
		try {
			dao.addAuthor(author);
			dao.commitTransaction();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void updateAuthor(Author author) {
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();
	}

	@Override
	public void removeAuthor(Author author) {
		dao.beginTransaction();
		dao.removeAuthor(author);
		dao.commitTransaction();
	}

	@Override
	public Author findAuthorById(int id) {
		Author author;
		author = dao.getAuthorByAuthorId(id);
		System.out.println("findEmployeeById in EmployeeServiceImpl");
		return author;
	}
}