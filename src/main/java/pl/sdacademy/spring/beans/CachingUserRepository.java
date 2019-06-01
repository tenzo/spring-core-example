package pl.sdacademy.spring.beans;

public class CachingUserRepository extends UserRepository{

    private String cachingStrategy;

    public String getCachingStrategy() {
        return cachingStrategy;
    }

    public void setCachingStrategy(String cachingStrategy) {
        this.cachingStrategy = cachingStrategy;
    }

    @Override
    public String toString() {
        return "CachingUserRepository{" +
                "cachingStrategy='" + cachingStrategy + '\'' +
                "} " + super.toString();
    }
}
