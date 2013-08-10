(ns foreclojure-solutions.p82
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Word Chains"
  true => (__ #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"})
  false => (__ #{"cot" "hot" "bat" "fat"})
  false => (__ #{"to" "top" "stop" "tops" "toss"})
  true => (__ #{"spout" "do" "pot" "pout" "spot" "dot"})
  true => (__ #{"share" "hares" "shares" "hare" "are"})
  false => (__ #{"share" "hares" "hare" "are"}))
