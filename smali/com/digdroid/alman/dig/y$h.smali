.class Lcom/digdroid/alman/dig/y$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/y;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/EditText;

.field final synthetic c:Lcom/digdroid/alman/dig/y;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/y;Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y$h;->c:Lcom/digdroid/alman/dig/y;

    iput-object p2, p0, Lcom/digdroid/alman/dig/y$h;->b:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$h;->c:Lcom/digdroid/alman/dig/y;

    iget-object p2, p0, Lcom/digdroid/alman/dig/y$h;->b:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/y;->w(Lcom/digdroid/alman/dig/y;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$h;->c:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->x(Lcom/digdroid/alman/dig/y;)I

    move-result p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/y$h;->c:Lcom/digdroid/alman/dig/y;

    invoke-virtual {p2}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method
