package vn.edu.vnu.java.prac02less23.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.vnu.java.prac02less23.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
