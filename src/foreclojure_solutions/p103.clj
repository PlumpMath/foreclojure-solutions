(ns foreclojure-solutions.p103
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Generating k-combinations"
  (__ 1 #{4 5 6}) => #{#{4} #{5} #{6}}
  (__ 10 #{4 5 6}) => #{}
  (__ 2 #{0 1 2}) => #{#{0 1} #{0 2} #{1 2}}
  (__ 3 #{0 1 2 3 4}) => #{#{0 1 2} #{0 1 3} #{0 1 4} #{0 2 3} #{0 2 4}
                           #{0 3 4} #{1 2 3} #{1 2 4} #{1 3 4} #{2 3 4}}
  (__ 4 #{[1 2 3] :a "abc" "efg"}) => #{#{[1 2 3] :a "abc" "efg"}}
  (__ 2 #{[1 2 3] :a "abc" "efg"}) => #{#{[1 2 3] :a} #{[1 2 3] "abc"} #{[1 2 3] "efg"}
                                      #{:a "abc"} #{:a "efg"} #{"abc" "efg"}})
