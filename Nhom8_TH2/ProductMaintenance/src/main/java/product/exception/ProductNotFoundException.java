package product.exception;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class ProductNotFoundException extends Throwable{
public ProductNotFoundException(String messString) {
	super(messString);
}
}
