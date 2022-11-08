package entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CourseMaterial")
public class CourseMaterial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToOne
	private Course course;
	
	private String url;
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public CourseMaterial(Course course, String url) {
		super();
		this.course = course;
		this.url = url;
	}

	
	
	
	
	
}
