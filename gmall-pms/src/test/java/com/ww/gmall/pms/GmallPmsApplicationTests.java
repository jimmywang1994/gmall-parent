package com.ww.gmall.pms;

import com.ww.gmall.pms.entity.Brand;
import com.ww.gmall.pms.entity.Product;
import com.ww.gmall.pms.service.BrandService;
import com.ww.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GmallPmsApplicationTests {
    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        Product product = productService.getById("1");
        System.out.println(product.getBrandName());

        //测试增删改在主库，查在从库
//        Brand brand = new Brand();
//        brand.setName("哈哈");
//        brandService.save(brand);
//        Brand byId = brandService.getById(53);
//        System.out.println(byId.getName());
    }

}
