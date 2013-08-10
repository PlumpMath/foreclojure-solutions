(ns foreclojure-solutions.p153
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Pairwise Disjoint Sets"
  (__ #{#{\U} #{\s} #{\e \R \E} #{\P \L} #{\.}}) => true
  (__ #{#{:a :b :c :d :e}
           #{:a :b :c :d}
           #{:a :b :c}
           #{:a :b}
           #{:a}}) => false
  (__ #{#{[1 2 3] [4 5]}
           #{[1 2] [3 4 5]}
           #{[1] [2] 3 4 5}
           #{1 2 [3 4] [5]}}) => true
  (__ #{#{'a 'b}
           #{'c 'd 'e}
           #{'f 'g 'h 'i}
           #{''a ''c ''f}}) => true
  (__ #{#{'(:x :y :z) '(:x :y) '(:z) '()}
           #{#{:x :y :z} #{:x :y} #{:z} #{}}
           #{'[:x :y :z] [:x :y] [:z] [] {}}}) => false
  (__ #{#{(= "true") false}
           #{:yes :no}
           #{(class 1) 0}
           #{(symbol "true") 'false}
           #{(keyword "yes") ::no}
           #{(class '1) (int \0)}}) => false
  (__ #{#{distinct?}
           #{#(-> %) #(-> %)}
           #{#(-> %) #(-> %) #(-> %)}
           #{#(-> %) #(-> %) #(-> %)}}) => true
  (__ #{#{(#(-> *)) + (quote mapcat) #_ nil}
           #{'+ '* mapcat (comment mapcat)}
           #{(do) set contains? nil?}
           #{, , , #_, , empty?}}) => false)
