public class Event extends Tasks {
  protected String start;
  protected String end;

  public Event(String description, String start, String end) {
    super(description);
    this.start = start;
    this.end = end;
  }

  @Override
  public String toString() {
    return "[E]" + super.toString() + "(" + start + end + ")";
  }
}