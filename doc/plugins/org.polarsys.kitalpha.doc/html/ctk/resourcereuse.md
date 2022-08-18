# Resource Reuse

## Objectives
Resource enables to retrieve a resource in the Eclipse platform / workspace, such as a document or model. During the search, it manages the workspace / platform priority.
After being marked, a resource can be retrieve by criteria:
* An identifier
* a name
* a domain
* a version
* a set of tags

## API

### ResourceHelper

This class provide API to retrieve programmatically a resource.

Provided by bundle: org.polarsys.kitalpha.resourcereuse

File name: [org.polarsys.kitalpha.resourcereuse.helper.ResourceHelper.java](https://github.com/eclipse/kitalpha/blob/master/resource%20reuse/plugins/org.polarsys.kitalpha.resourcereuse/src/org/polarsys/kitalpha/resourcereuse/helper/ResourceHelper.java)

### Contributing a resource to ResourceReuse registry

To contribute a resource is done through extension point [org.polarsys.kitalpha.resourcereuse.resources](https://github.com/eclipse/kitalpha/blob/master/resource%20reuse/plugins/org.polarsys.kitalpha.resourcereuse/schema/resources.exsd)

Attributes of the ResourceReuse extension point: 
* `id`:	The ID of the resource (mandatory)
* `name`:	The Name of the resource (mandatory)
* `path`:	Path to access the resource
* `version`: a version associated to the resource 
* `domain`: The resource domain
* `tags`:	A set of tags separated by a comma

