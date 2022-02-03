.class Lcom/digdroid/alman/dig/r$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/digdroid/alman/dig/r;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r$a;->c:Lcom/digdroid/alman/dig/r;

    iput p2, p0, Lcom/digdroid/alman/dig/r$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/r$a;->c:Lcom/digdroid/alman/dig/r;

    invoke-static {v0}, Lcom/digdroid/alman/dig/r;->a(Lcom/digdroid/alman/dig/r;)Lcom/digdroid/alman/dig/s3;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/r$a;->c:Lcom/digdroid/alman/dig/r;

    iget-object v1, v1, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    iget v2, p0, Lcom/digdroid/alman/dig/r$a;->b:I

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
