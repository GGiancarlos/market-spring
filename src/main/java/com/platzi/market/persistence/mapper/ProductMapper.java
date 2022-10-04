package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})   // uses: para mapear una categoria -> category haciendo uso de CategoryMapper
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "categoria", target = "category") // se mapea una entidad categoria
    })
    Product toProduct(Producto producto);

    List<Product> toProducts(List<Producto> productos); // este mapeo es posible ya que se definio como mapear una entidad, por lo tanto mapStruct lo reconoce

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)    // no se mapea codigoBarras
    Producto toProducto(Product product);
}
