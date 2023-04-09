package mx.developer.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Document(collection= "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

	@Id
	private ObjectId id;
	private String content;
	
	public Review(String content) {
		super();
		this.content = content;
	}
	
	
}
