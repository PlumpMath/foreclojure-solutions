(ns foreclojure-solutions.p101
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Levenshtein Distance"
  (__ "kitten" "sitting") => 3
  (= (__ "closure" "clojure") (__ "clojure" "closure") 1) => true
  (__ "xyx" "xyyyx") => 2
  (__ "" "123456") => 6
  (= (__ "Clojure" "Clojure") (__ "" "") (__ [] []) 0) => true
  (__ [1 2 3 4] [0 2 3 4 5]) => 2
  (__ '(:a :b :c :d) '(:a :d)) => 2
  (__ "ttttattttctg" "tcaaccctaccat") => 10
  (__ "gaattctaatctc" "caaacaaaaaattt") => 9)
