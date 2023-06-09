/**
 * 
 */
package in.project.bookish.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author lenovo1
 *
 */

@Entity
@Table(name="tbl_book")
@Setter
@Getter
@ToString
@Builder
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String description;
	
	@Column(name="unit_price")
	private BigDecimal unitPrice;
	
	@Column(name="image_url")
	private String imageUrl;
	
	private boolean active;
	
	@Column(name="unit_in_stock")
	private int unitInStock;
	
	@Column(name="date_created")
	private Date createdOn;
	
	@Column(name="last_updated")
	private Date updatedOn;
	
	@ManyToOne
	@JoinColumn(name="category_id", nullable = false)
	private Category category;
	
	

}
