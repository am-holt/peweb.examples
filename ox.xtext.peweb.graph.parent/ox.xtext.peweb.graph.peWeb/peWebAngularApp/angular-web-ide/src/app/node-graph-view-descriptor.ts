import{ViewDescriptor} from './view-descriptor';

export class NodeGraphViewDescriptor  implements ViewDescriptor{
	
	static readonly NODEGRAPH_TYPE = "NodeGraph"

	//The type of the descriptor
	type:string;

	//List of the nodes attributes to display
	vertices: Vertex[];

	//List of the node's reference sets to display
	edges: Edge[];

	//the nodeId of the node this projection belongs to
	nodeId: string
}

export class Vertex{
	id: string
	nodeId: string
}

export class Edge{
	source: string;
	target: string;
	nodeId: string;
}