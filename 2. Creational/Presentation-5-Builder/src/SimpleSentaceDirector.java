public class SimpleSentaceDirector {
	private SentenceBuilder builder;

	public SimpleSentaceDirector(SentenceBuilder builder) {
		this.builder =  builder;
	}
	public void Counsruct() {
		 builder.extendSentence();
		 builder.buildSubject() ;
		 builder.buildVerb() ;
		 builder.buildObject();
	}

}
