package pl.sdacademy.spring.beans;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class CollectionsBean {

    List<String> names;
    List<Project> projects;
    Set<String> countries;
    Map<User, Integer> scores;
    Map<User, Project> projectMapping;

    public void setProjectMapping(Map<User, Project> projectMapping) {
        this.projectMapping = projectMapping;
    }

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

    public Map<User, Integer> getScores() {
        return scores;
    }

    public void setScores(Map<User, Integer> scores) {
        this.scores = scores;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "CollectionsBean{" +
                "names=" + names +
                ", projects=" + projects +
                ", countries=" + countries +
                ", scores=" + scores +
                ", projectMapping=" + projectMapping +
                '}';
    }
}
