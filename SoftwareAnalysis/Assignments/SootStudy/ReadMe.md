- [Soot Basics](SootBasicConcepts.md)

- Soot Help

```zsh
General Options:
  -h -help                     Display help and exit
  -pl -phase-list              Print list of available phases
  -ph PHASE -phase-help PHASE  Print help for specified PHASE
  -version                     Display version information and exit
  -v -verbose                  Verbose mode
  -interactive-mode            Run in interactive mode
  -unfriendly-mode             Allow Soot to run with no command-line options
  -app                         Run in application mode
  -w -whole-program            Run in whole-program mode
  -ws -whole-shimple           Run in whole-shimple mode
  -validate                    Run internal validation on bodies
  -debug                       Print various Soot debugging info
  -debug-resolver              Print debugging info from SootResolver

Input Options:
  -cp PATH -soot-class-path PATH -soot-classpath PATH
                               Use PATH as the classpath for finding classes.
  -pp -prepend-classpath       Prepend the given soot classpath to the default
                               classpath.
  -process-path DIR -process-dir DIR
                               Process all classes found in DIR
  -ast-metrics                 Compute AST Metrics if performing java to
                               jimple
  -src-prec FORMAT             Sets source precedence to FORMAT files
     c class (default)           Favour class files as Soot source
     only-class                  Use only class files as Soot source
     J jimple                    Favour Jimple files as Soot source
     java                        Favour Java files as Soot source
  -full-resolver               Force transitive resolving of referenced
                               classes
  -allow-phantom-refs          Allow unresolved classes; may cause errors
  -no-bodies-for-excluded      Do not load bodies for excluded classes
  -j2me                        Use J2ME mode; changes assignment of types
  -main-class CLASS            Sets the main class for whole-program analysis.
  -polyglot                    Use Java 1.4 Polyglot frontend instead of
                               JastAdd

Output Options:
  -d DIR -output-dir DIR       Store output files in DIR
  -f FORMAT -output-format FORMAT
                               Set output format for Soot
     J jimple                    Produce .jimple Files
     j jimp                      Produce .jimp (abbreviated Jimple) files
     S shimple                   Produce .shimple files
     s shimp                     Produce .shimp (abbreviated Shimple) files
     B baf                       Produce .baf files
     b                           Produce .b (abbreviated Baf) files
     G grimple                   Produce .grimple files
     g grimp                     Produce .grimp (abbreviated Grimp) files
     X xml                       Produce .xml Files
     n none                      Produce no output
     jasmin                      Produce .jasmin files
     c class (default)           Produce .class Files
     d dava                      Produce dava-decompiled .java files
     t template                  Produce .java files with Jimple templates.
  -outjar -output-jar          Make output dir a Jar file instead of dir
  -xml-attributes              Save tags to XML attributes for Eclipse
  -print-tags -print-tags-in-output
                               Print tags in output files after stmt
  -no-output-source-file-attribute
                               Don't output Source File Attribute when
                               producing class files
  -no-output-inner-classes-attribute
                               Don't output inner classes attribute in class
                               files
  -dump-body PHASENAME         Dump the internal representation of each method
                               before and after phase PHASENAME
  -dump-cfg PHASENAME          Dump the internal representation of each CFG
                               constructed during phase PHASENAME
  -show-exception-dests        Include exception destination edges as well as
                               CFG edges in dumped CFGs
  -gzip                        GZip IR output files

Processing Options:
  -p PHASE OPT:VAL -phase-option PHASE OPT:VAL
                               Set PHASE's OPT option to VALUE
  -O -optimize                 Perform intraprocedural optimizations
  -W -whole-optimize           Perform whole program optimizations
  -via-grimp                   Convert to bytecode via Grimp instead of via
                               Baf
  -via-shimple                 Enable Shimple SSA representation
  -throw-analysis ARG
     pedantic (default)          Pedantically conservative throw analysis
     unit                        Unit Throw Analysis
  -omit-excepting-unit-edges   Omit CFG edges to handlers from excepting units
                               which lack side effects
  -trim-cfgs                   Trim unrealizable exceptional edges from CFGs

Application Mode Options:
  -i PKG -include PKG          Include classes in PKG as application classes
  -x PKG -exclude PKG          Exclude classes in PKG from application classes
  -include-all                 Set default excluded packages to empty list
  -dynamic-class CLASS         Note that CLASS may be loaded dynamically
  -dynamic-dir DIR             Mark all classes in DIR as potentially dynamic
  -dynamic-package PKG         Marks classes in PKG as potentially dynamic

Input Attribute Options:
  -keep-line-number            Keep line number tables
  -keep-bytecode-offset -keep-offset
                               Attach bytecode offset to IR

Annotation Options:
  -annot-purity                Emit purity attributes
  -annot-nullpointer           Emit null pointer attributes
  -annot-arraybounds           Emit array bounds check attributes
  -annot-side-effect           Emit side-effect attributes
  -annot-fieldrw               Emit field read/write attributes

Miscellaneous Options:
  -time                        Report time required for transformations
  -subtract-gc                 Subtract gc from time

```
