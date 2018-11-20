package com.telesens.academy.automationpracticeOld.modelUpdate;

/*public class EntityDress1 {

    private String model;
    private String name;
    private String size;
    private String color;

    // TODO migrate to decimal
    private double price;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "EntityDress{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


}*/



/*
import java.util.Objects;

public class EntityDressUp {
    private String model;
    private String name;
    private String size;
    private String color;
    // TODO migrate to BigDecimal
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Позиция{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price + "$" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityDressUp that = (EntityDressUp) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(model, that.model) &&
                Objects.equals(name, that.name) &&
                Objects.equals(size, that.size) &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, name, size, color, price);
    }
}*/



import java.util.Objects;

public class EntityDressUp implements Comparable<EntityDressUp> {
    private String model;
    private String name;
    private String size;
    private String color;
    // TODO migrate to BigDecimal
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public EntityDressUp withModel(String model) {
        this.model = model;
        return this;
    }

    public EntityDressUp withName(String name) {
        this.name = name;
        return this;
    }

    public EntityDressUp withSize(String size) {
        this.size = size;
        return this;
    }

    public EntityDressUp withColor(String color) {
        this.color = color;
        return this;
    }

    public EntityDressUp withPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Позиция{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price + "$" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityDressUp that = (EntityDressUp) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(model, that.model) &&
                Objects.equals(name, that.name) &&
                Objects.equals(size, that.size) &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, name, size, color, price);
    }

    @Override
    public int compareTo (EntityDressUp other) {
        return this.model.compareTo(other.model);
    }

    /**
     * Сравнивает этот объект 'this' со переданным 'other'.
     * Возвращает:
     *  0 - если объекты равны
     *  -1 - если 'this' меньше 'other'
     *  1 - если 'this' больше 'other'
     * Данный метод вызывается алгоритмом сортировки для упорядочивания
     */
   /* @Override
    public int compareTo(EntityDressUp other) {
        return Double.compare(other.price, this.price);
    }*/
}