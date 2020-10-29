public class AnswerCell2 {
  public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if (!isAsleep) {
      if (isMom) {
        return true;
      } else if (isMorning) {
        return false;
      } else {
        return true;
      }
    }
    return false;
  }

// more concise:
// public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
//   return (!isAsleep && !isMorning || (!isAsleep && isMom));
// }
}
