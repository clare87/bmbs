package com.bmbs.sale.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bmbs.sale.bean.ProductPO;
import com.bmbs.sale.bean.ProductPicPO;

@Repository
public class ProductDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public ProductPO getProductById(String productId){
		String proSql = "select * from t_product where b_productId = ?";
		ProductPO product = jdbcTemplate.queryForObject(proSql, new Object[]{productId}, new ProductRowMapper());
		String picSql = "select * from t_productpic where b_productId = ?";
		List<ProductPicPO> proPics = jdbcTemplate.query(picSql, new Object[]{productId}, new ProductPicRowMapper());
		product.setProductPics(proPics);
		return product;
	} 
	
	public List<ProductPO> getProductList(String productTypeId){
		String proListSql = "select * from t_product where b_productType = ?";
		List<ProductPO> products = jdbcTemplate.query(proListSql, new Object[]{productTypeId},new ProductRowMapper());
		return products;
	}
	
	private class ProductRowMapper implements RowMapper<ProductPO>{
		public ProductPO mapRow(ResultSet rs, int index) throws SQLException {
			ProductPO product = new ProductPO();
			product.setProductID(rs.getString("b_productId"));
			product.setProductName(rs.getString("b_productName"));
			product.setMainPicUrl(rs.getString("b_mainPicUrl"));
			product.setIntroduction(rs.getString("b_introduction"));
			product.setPrice(rs.getDouble("b_price"));
			product.setMaterial(rs.getString("b_material"));
			product.setProducer(rs.getString("b_producer"));
			product.setStuff(rs.getString("b_stuff"));
			product.setDescription(rs.getString("b_description"));
			return product;
		}
	}
	
	private class ProductPicRowMapper implements RowMapper<ProductPicPO>{
		public ProductPicPO mapRow(ResultSet rs, int rowNum) throws SQLException {
			ProductPicPO pic = new ProductPicPO();
			pic.setPicID(rs.getString("b_picId"));
			pic.setPicUrl(rs.getString("b_picUrl"));
			pic.setProductID(rs.getString("b_productId"));
			return pic;
		}
	}

}
