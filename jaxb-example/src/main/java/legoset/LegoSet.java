package legoset;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import movie.YearAdapter;

import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;

@Data
@XmlRootElement
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces", "packaging", "tags", "minifigs", "ratings"})
@XmlAccessorType(XmlAccessType.FIELD)
public class LegoSet {

    @XmlAttribute
    private String number;

    @XmlAttribute
    private URL url;

    private String name;
    private String theme;
    private String subtheme;
    private Packaging packaging;
    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;
    private List<Ratings> ratings;

}
