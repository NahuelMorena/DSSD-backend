package dssd.global.furniture.backend.controllers.dtos.request;

import java.util.List;

public class OrdersRequestDTO {
    private Long collection_id;
    private List<OrderRequest> orders;

    public static class OrderRequest {
        private Long id_store;
        private Integer quantity;

        public Long getId_store() {
            return id_store;
        }

        public void setId_store(Long id_store) {
            this.id_store = id_store;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }
    }

    public Long getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(Long collection_id) {
        this.collection_id = collection_id;
    }

    public List<OrderRequest> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderRequest> orders) {
        this.orders = orders;
    }
}
