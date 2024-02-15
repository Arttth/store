package ru.art.goods.api.request;

import java.util.Objects;

public class GoodRequest {
    private String name;
    private String img;
    private String seller;

    @Override
    public String toString() {
        return "GoodRequest{" +
                "name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", seller='" + seller + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodRequest that = (GoodRequest) o;
        return Objects.equals(name, that.name) && Objects.equals(img, that.img) && Objects.equals(seller, that.seller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, img, seller);
    }

    public GoodRequest(String name, String img, String seller) {
        this.name = name;
        this.img = img;
        this.seller = seller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
}
