package com.PerSEO.Hexagonalintentoryapp.order.infrastructure.mapper;

import com.PerSEO.Hexagonalintentoryapp.order.domain.model.OrderProduct;
import com.PerSEO.Hexagonalintentoryapp.order.infrastructure.entity.OrderProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IOrderProductMapper {
    @Mappings(
            {
                    @Mapping(source = "id", target = "id"),
                    @Mapping(source = "quantity", target = "quantity"),
                    @Mapping(source = "price", target = "price"),
                    @Mapping(source = "productId", target = "productId")
                    //@Mapping(source = "orderEntity", target = "orderEntity")
            }
    )
    OrderProduct toOrderProduct(OrderProductEntity orderProductEntity);
    Iterable<OrderProduct> toOrderproductList(Iterable<OrderProductEntity> orderProductEntities);

    @InheritInverseConfiguration
    OrderProductEntity toOrderProductEntity(OrderProduct orderProduct);

}
