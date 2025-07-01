package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.Cart;
import com.springmvc.exception.CartException;
import com.springmvc.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartRepository cartRepository;
	
	public Cart create(Cart cart) {
		return cartRepository.create(cart);
	}
	
	public Cart read(String cartId) {
		return cartRepository.read(cartId);
	}

	@Override
	public void update(String cartId, Cart cart) {
		cartRepository.update(cartId, cart);
	}

	@Override
	public void delete(String cartId) {
		cartRepository.delete(cartId);
		
	}

	@Override
	public Cart validateCart(String cartId) {
	    System.out.println("🛒 cartId: " + cartId);

	    Cart cart = cartRepository.read(cartId); // 📌 먼저 선언해야 함

	    System.out.println("🧺 장바구니 아이템 수: " + (cart != null ? cart.getCartItems().size() : "null"));

	    if(cart == null || cart.getCartItems().size() == 0) {
	        throw new CartException(cartId);
	    }
	    return cart;
	}

	
	
	
	
}
