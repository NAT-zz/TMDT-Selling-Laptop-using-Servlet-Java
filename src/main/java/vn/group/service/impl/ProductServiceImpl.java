package vn.group.service.impl;

import java.util.List;

import vn.group.dao.ProductDao;
import vn.group.dao.impl.ProductDaoImpl;
import vn.group.model.ProductDetailModel;
import vn.group.model.ProductModel;
import vn.group.service.ProductService;

public class ProductServiceImpl implements ProductService{
	ProductDao product = new ProductDaoImpl();

	@Override
	public List<ProductModel> getAllProduct() {
		// TODO Auto-generated method stub
		return product.getAllProduct();
	}

	@Override
	public List<ProductModel> getTopProduct() {
		// TODO Auto-generated method stub
		return product.getTopProduct();
	}

	@Override
	public List<ProductModel> getSellestProduct() {
		// TODO Auto-generated method stub
		return product.getSellestProduct();
	}

	@Override
	public List<ProductModel> pagingProduct(int index) {
		// TODO Auto-generated method stub
		return product.pagingProduct(index);
	}

	@Override
	public List<ProductModel> pagingProductByBId(int index, int bId) {
		// TODO Auto-generated method stub
		return product.pagingProductByBId(index, bId);
	}

	@Override
	public int countProductByBId(int bId) {
		// TODO Auto-generated method stub
		return product.countProductByBId(bId);
	}

	@Override
	public int countProduct() {
		// TODO Auto-generated method stub
		return product.countProduct();
	}

	@Override
	public List<ProductModel> searchProduct(String kw) {
		// TODO Auto-generated method stub
		return product.searchProduct(kw);
	}

	@Override
	public ProductModel getProductById(int id) {
		// TODO Auto-generated method stub
		return product.getProductById(id);
	}

	@Override
	public ProductDetailModel getProductDetail(int id) {
		// TODO Auto-generated method stub
		return product.getProductDetail(id);
	}

}