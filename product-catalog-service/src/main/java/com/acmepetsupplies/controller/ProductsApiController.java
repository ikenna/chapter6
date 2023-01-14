package com.acmepetsupplies.controller;

import com.acmepetsupplies.model.Product;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.util.*;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-31T13:20:55.039973Z[Europe/London]")
@Controller
@RequestMapping("${openapi.productCatalog.base-path:}")
public class ProductsApiController implements ProductsApi {

    private final NativeWebRequest request;

    @Autowired
    public ProductsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Product> viewProduct(
            @Parameter(name = "id", description = "Product identifier", required = true) @PathVariable("id") UUID id){
        Product product = new Product();
        product.setId(id);
        product.setName("Acme Uber Dog Rope Toy");
        product.setDescription("Acme Uber Dog Rope Toy provides hours of fun for your dog.");
        product.setPrice(new BigDecimal(50));
        Set<String> keywords = new HashSet<>(Arrays.asList("rope", "toy", "dog"));
        product.setKeywords(keywords);
        product.setReviewRating(4);
        product.setNumberOfReviews(10);
        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }
}
