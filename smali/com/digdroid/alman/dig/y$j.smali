.class Lcom/digdroid/alman/dig/y$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/y;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/AlertDialog;

.field final synthetic c:Landroid/widget/TextView;

.field final synthetic d:Lcom/digdroid/alman/dig/y;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/y;Landroid/app/AlertDialog;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y$j;->d:Lcom/digdroid/alman/dig/y;

    iput-object p2, p0, Lcom/digdroid/alman/dig/y$j;->b:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/digdroid/alman/dig/y$j;->c:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const/4 p3, 0x1

    const/4 p4, 0x0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/y$j;->b:Landroid/app/AlertDialog;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/y$j;->c:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/digdroid/alman/dig/y$j;->d:Lcom/digdroid/alman/dig/y;

    const v1, 0x7f1100ac

    new-array p3, p3, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p3, p4

    invoke-virtual {v0, v1, p3}, Landroid/app/DialogFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
