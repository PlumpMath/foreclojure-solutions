(ns foreclojure-solutions.p77
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Anagram Finder"
  (__ ["meat" "mat" "team" "mate" "eat"]) => #{#{"meat" "team" "mate"}}
  (__ ["veer" "lake" "item" "kale" "mite" "ever"]) => #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}})
