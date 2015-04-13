# Preparing data
Data may be obtained from multiple sources, such as transaction logs, database snapshots and segmentation models.

##Facts

Data must be transposed into _facts_ before it can be ingested and stored in Ivory.

A fact has these components:

&lt;Entity&gt; &lt;Attribute&gt; &lt;Value&gt; &lt;Time&gt;

That is, a fact represents the _value_ of an _attribute_ associated with an _entity_, which is known to be valid at some point in _time_.

Examples of facts are:

<table>
    <tr><td>*Entity*</td><td>*Attribute*</td><td>*Value*</td><td>*Time*</td></tr>
    <tr><td>cust_00678</td><td>gender</td><td>M</td><td>2011-03-17</td></tr>
    <tr><td>acnt_1234</td><td>balance</td><td>342.17</td><td>2014-06-01</td></tr>
    <tr><td>car_98732</td><td>make</td><td>Toyota</td><td>2012-09-25</td></tr>

The attributes referenced in facts must be declared in the Ivory repository's dictionary. The dictionary lists all known attributes and the metadata associated with them.

##Transposing data

You can use various tools to transpose data into a format that Ivory can ingest:

* SQL
* Python scripts
* [Apache Thrift](https://thrift.apache.org/)

Ivory can ingest facts in these formats:

* Text - human readable, and can include JSON structs, but is not recommended for production due to performance reasons.
* Binary - generated using Thrift, for example, and recommended for production.
