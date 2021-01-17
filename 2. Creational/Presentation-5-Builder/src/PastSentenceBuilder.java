public class PastSentenceBuilder implements SentenceBuilder{
	private String subject, verb, object,sentence;

	public PastSentenceBuilder(String subject, String verb, String object) {
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
		sentence += verb + "ed ";
	}

	@Override
	public void buildObject() {
		sentence += object;
	}

	@Override
	public void extendSentence() {
		sentence += "Yesterday, ";
	}
	@Override
	public void whenSentence() {
		sentence += "When did ";
	}
	public String getResult() {
		return sentence;
	}
	public void reset() {
		sentence = "";
	}
}
