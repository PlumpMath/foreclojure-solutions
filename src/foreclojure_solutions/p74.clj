(ns foreclojure-solutions.p74
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Filter Perfect Squares"
  (__ "4,5,6,7,8,9") => "4,9"
  (__ "15,16,25,36,37") => "16,25,36")
