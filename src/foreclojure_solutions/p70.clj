(ns foreclojure-solutions.p70
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Word Sorting"
  (__  "Have a nice day.") => ["a" "day" "Have" "nice"]
  (__  "Clojure is a fun language!") => ["a" "Clojure" "fun" "is" "language"]
  (__  "Fools fall for foolish follies.") => ["fall" "follies" "foolish" "Fools" "for"])
