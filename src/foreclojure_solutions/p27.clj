(ns foreclojure-solutions.p27
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Palindrome Detector"
  (false? (__ '(1 2 3 4 5))) => true
  (true? (__ "racecar")) => true
  (true? (__ [:foo :bar :foo])) => true
  (true? (__ '(1 1 3 3 1 1))) => true
  (false? (__ '(:a :b :c))) => true)
