package fo.utilities

class GoToAction : GoToEntity {
    constructor(action: () -> Unit)
    {
        this._gotoAction = action
    }

}