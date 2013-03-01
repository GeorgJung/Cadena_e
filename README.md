Cadena_e
========

An integrated meta-modeling based software engineering framework

(Revival of the Cadena research project for typing-based meta-modeling
in component-oriented architectures and model driven development)


Abstract
--------

Model driven development and meta-modeling is a novel approach to
software engineering that focuses on radical modularization and
consistent, multi-level, abstraction and concretization (i.e.,
development) of software artifacts through hierarchic modeling. The
aims of the model driven development paradigm are

+ a better management of the enormous complexity of modern-day software,

+ better re-use of existing software in various contexts,

+ better maintainability of software systems,

+ increased reliability of software systems, and

+ a substantial decrease in the costs of software development.

In this topic, *Cadena*, a model-based software engineering
framework developed at Kansas State University will be enhanced and
recreated as an Eclipse plugin. The name of the project is
*Cadena_e*, where 'e' can stand for version 5, "enhanced", "embedded
systems", or "Egypt", whichever you like best.

All projects and tasks within this topic will require you to use Java,
Git, Eclipse, some teamwork, and of course LaTeX

Projects
--------

### Structural modeling

CADENA_e is based on a component oriented programming
paradigm. Components are software artifacts that form the primary
building blocks of a system (comparable to objects in object oriented
programming), they are defined by their interfaces and can be easily
plugged together or interchanged. Component diagrams specify how
various components interact within a larger system. The structural
modeling tools in CADENA_e should allow to design component diagram
styles, create components, and assemble the components into scenarios.

#### Graph-based component diagram editing feature

You will use the graph editing features in eclipse to build a three tier component graph creation and editing feature for CADENA_e.

#### Form-based component diagram editing feature

You will use the form editing features in eclipse to build a three tier component graph creation and editing feature for CADENA_e.


### Behavioral modeling

The original CADENA featured only structural modeling. However, a
generic, abstract, behavioral specification in form of activity graphs
will mark an important step towards pure model driven development
(where actual coding can be reduced to a minimum or even
eliminated). I this project, graph-based and form-based editors for
behavioral modeling based on lightweight process coordination will be
implemented.

#### Graph-based process specification feature

You will implement a creation and editing tool for processes based on the Eclipse graph libraries and lightweight process coordination.

#### Form-based process specification feature

You will use the form editing tools in Eclipse to implement an editing feature for various process algebras or similar process description formalisms.

#### Test execution environment

You will animate the behavioral specifications (or even execute the various processes) in a test-run environment for validating and debugging.


### Verification/validation features

A major advantage of model driven development is that the "code"
(i.e., the models) are abstract enough to easily introduce well
established formal verification procedures without much
preprocessing. This project will enable model checking on the given
behavioral models.

#### Behavioral model back-end translator

You will translate the given behavioral description in CADENA_e into
the input syntax of a well known model-cheking tool. Infrastructure to
automatically run the model checker is required, editing support or
backwards translation would be a bonus.

#### Time-edit verification formula generator

Some advanced input artifacts of modern lightweight formal
verification tools are not easy to use for a software engineer without
specific training. In this task, you will break down the generation of
LTL formulas to simple time-line manipulations that are intuitive to
use.


### Dimensional typing

Sensors measure physical sizes or quantities. These quantities are
generally compromised of a scalar value and a unit. The units, in
turn, are related to each other by their physical dimension. For
example, length is measured in meters, so when measuring a distance
the result would be a scalar X and the unit Meter (Xm). Speed for
example is the distance per time unit (the first derivation of length
over time). Therefore, the dimension of speed is length divided by
time. Likewise, the dimension of acceleration is speed divided by
time, or length by time square. The source of some of the most
frequently occurring errors in the usage of sensors and unit-carrying
values are conversion errors that could be avoided by the proven
technique of typing. This project aims to create a dimensional typing
system for a plug and play sensor service and component system.

#### Dimensional type system

You will develop and implement a dimensional type system for physical
quantities. It should allow assignments such as "speed = (1km + 25m) /
20s".


### Tool support

Some features projected for CADENA_e are independent from the
conceptual part and mainly serve editing and visualization
convenience. In this project, such features will be implemented.

#### Multi-feature graph layouter

Graph-based editing of complex systems often suffers from the size of
the resulting graphs and the lack of structure and overview. In this
task, you will implement a specialized graph layouter based on various
standard graph layouting algorithms with added features such as
subgraph-folding, fixing of specific nodes, sorting of nodes according
to specific properties, etc.


### Case study

We will build an example and experimentation system that will
gradually include the ideas of model driven development for testing
the concepts of CADENA_e in practice.

#### Real-time fitness monitor

You will implement a multi-sensor tracking and analysis tool for a
specific physical workout routine to track performance and fitness
level of a practitioner over a single and over multiple sessions.
