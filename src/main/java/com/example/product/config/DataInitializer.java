// 12. src/main/java/com/example/product/config/DataInitializer.java
package com.example.product.config;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    
    private final ProductRepository productRepository;
    
    @Override
    public void run(String... args) throws Exception {
        if (productRepository.count() == 0) {
            productRepository.save(Product.builder()
                .name("노트북")
                .description("고성능 게이밍 노트북")
                .price(new BigDecimal("1500000.00"))
                .quantity(10)
                .build());
                
            productRepository.save(Product.builder()
                .name("스마트폰")
                .description("최신 플래그십 스마트폰")
                .price(new BigDecimal("800000.00"))
                .quantity(25)
                .build());
                
            productRepository.save(Product.builder()
                .name("태블릿")
                .description("10인치 태블릿")
                .price(new BigDecimal("400000.00"))
                .quantity(15)
                .build());
                
            productRepository.save(Product.builder()
                .name("키보드")
                .description("기계식 키보드")
                .price(new BigDecimal("120000.00"))
                .quantity(50)
                .build());
                
            productRepository.save(Product.builder()
                .name("마우스")
                .description("무선 게이밍 마우스")
                .price(new BigDecimal("80000.00"))
                .quantity(30)
                .build());
                
            System.out.println("초기 데이터가 성공적으로 생성되었습니다.");
        }
    }
}