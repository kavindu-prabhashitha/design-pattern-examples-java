for those who are interested to learn UI factories // Abstract base class representing the UIFactory
class UIFactory {
    createTrainingUI() {
        throw new Error("createTrainingUI method must be overridden");
    }
    createQueryUI() {
        throw new Error("createQueryUI method must be overridden");
    }
    createEditUI() {
        throw new Error("createEditUI method must be overridden");
    }
}

 

// Concrete class representing TrainingUI elements
class TrainingUI {
    display() {
        console.log("Training UI elements displayed");
    }
}


// Concrete class representing QueryUI elements
class QueryUI {
    display() {
        console.log("Query UI elements displayed");
    }
}


// Concrete class representing EditUI elements
class EditUI {
    display() {
        console.log("Edit UI elements displayed");
    }
}


// Concrete subclass of UIFactory implementing CreateTrainingUI, CreateQueryUI, and CreateEditUI
class UIFactoryImpl extends UIFactory {
    createTrainingUI() {
        return new TrainingUI();
    }
    createQueryUI() {
        return new QueryUI();
    }
    createEditUI() {
        return new EditUI();
    }
}

 

// Factory for OpenAI-related UI elements
class OpenAIUIFactory extends UIFactory {
    createTrainingUI() {
        return new OpenAITrainingUI();
    }
    createQueryUI() {
        return new OpenAIQueryUI();
    }
    createEditUI() {
        return new OpenAIEditUI();
    }
}

 

// Factory for QnA-related UI elements
class QnAUIFactory extends UIFactory {
    createTrainingUI() {
        return new QnATrainingUI();
    }
    createQueryUI() {
        return new QnAQueryUI();
    }

    createEditUI() {
        return new QnAEditUI();
    }
}

 

// Example OpenAI UI classes
class OpenAITrainingUI {
    display() {
        console.log("OpenAI Training UI elements displayed");
    }
}

class OpenAIQueryUI {
    display() {
        console.log("OpenAI Query UI elements displayed");
    }
}

 

class OpenAIEditUI {
    display() {
        console.log("OpenAI Edit UI elements displayed");
    }
}

 

// Example QnA UI classes
class QnATrainingUI {
    display() {
        console.log("QnA Training UI elements displayed");
    }
}

class QnAQueryUI {
    display() {
        console.log("QnA Query UI elements displayed");
    }
}

 

class QnAEditUI {
    display() {
        console.log("QnA Edit UI elements displayed");
    }
}

 

// Client code
function clientCode(factory) {
    const trainingUI = factory.createTrainingUI();
    trainingUI.display();
    const queryUI = factory.createQueryUI();
    queryUI.display();
    const editUI = factory.createEditUI();
    editUI.display();
}

 

// Using the factories
const defaultFactory = new UIFactoryImpl();
clientCode(defaultFactory);

const openAIFactory = new OpenAIUIFactory();
clientCode(openAIFactory);

const qnaFactory = new QnAUIFactory();
clientCode(qnaFactory);
