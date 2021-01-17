public class WhenSentaceDirector {
	private SentenceBuilder builder;

	public WhenSentaceDirector(SentenceBuilder builder) {
		this.builder =  builder;
	}
	public void Counsruct() {
		builder.whenSentence();
		builder.buildSubject();
		builder.buildVerb();
		builder.buildObject();
	}

}
