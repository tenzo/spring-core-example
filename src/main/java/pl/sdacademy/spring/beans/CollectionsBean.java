package pl.sdacademy.spring.beans;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.Map;

@Service("helloWorldService")
public class CollectionsBean {

    List<String> names;
    Set<String> countries;
    Map<String, Integer> scores;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public Set<String> getCountries() {
        return countries;
    }

    public void setCountries(Set<String> countries) {
        this.countries = countries;
    }

    public Map<String, Integer> getScores() {
        return scores;
    }

    public void setScores(Map<String, Integer> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "CollectionsBean{" +
                "names=" + names +
                ", countries=" + countries +
                ", scores=" + scores +
                '}';
    }
}
