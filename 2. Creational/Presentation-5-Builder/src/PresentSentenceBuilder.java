public class PresentSentenceBuilder implements SentenceBuilder{
	private String subject, verb, object, sentence;

	public PresentSentenceBuilder(String subject, String verb, String object) {
		super();
		this.subject = subject;
		this.verb = verb;
		this.object = object;
		reset();
	}

	@Override
	public void buildSubject() {
		sentence += "the " + subject + " ";
	}
	@Override
	public void buildVerb() {
		sentence += verb + "s ";
	}
	@Override
	public void buildObject() {
		sentence += object+ " ";
	}
	@Override
	public void extendSentence() {
		sentence += "Everyday, ";
	}
	@Override
	public void whenSentence() {
		sentence += "When does ";
	}
	public String getResult() {
		return sentence;
	}
	public void reset() {
		sentence = "";
	}
}
