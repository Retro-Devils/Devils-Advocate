.class Lcom/digdroid/alman/dig/q3$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q3;->a(Landroid/app/Activity;Lcom/digdroid/alman/dig/s3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/s3;

.field final synthetic c:Landroid/widget/EditText;

.field final synthetic d:Landroid/widget/EditText;

.field final synthetic e:Landroid/widget/EditText;

.field final synthetic f:Landroid/widget/TextView;

.field final synthetic g:Landroid/widget/CheckBox;

.field final synthetic h:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s3;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/CheckBox;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$b;->b:Lcom/digdroid/alman/dig/s3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/q3$b;->c:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/digdroid/alman/dig/q3$b;->d:Landroid/widget/EditText;

    iput-object p4, p0, Lcom/digdroid/alman/dig/q3$b;->e:Landroid/widget/EditText;

    iput-object p5, p0, Lcom/digdroid/alman/dig/q3$b;->f:Landroid/widget/TextView;

    iput-object p6, p0, Lcom/digdroid/alman/dig/q3$b;->g:Landroid/widget/CheckBox;

    iput-object p7, p0, Lcom/digdroid/alman/dig/q3$b;->h:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$b;->b:Lcom/digdroid/alman/dig/s3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3$b;->c:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    const-string v0, "author"

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/n;->q(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$b;->b:Lcom/digdroid/alman/dig/s3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3$b;->d:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    const-string v0, "author_contact"

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/n;->q(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$b;->b:Lcom/digdroid/alman/dig/s3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3$b;->e:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    const-string v0, "description"

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/n;->q(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$b;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-le p2, v1, :cond_0

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    const-string v1, "/"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3$b;->b:Lcom/digdroid/alman/dig/s3;

    const-string v1, "screenshots"

    invoke-virtual {p2, v1, p1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$b;->b:Lcom/digdroid/alman/dig/s3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3$b;->g:Landroid/widget/CheckBox;

    invoke-virtual {p2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p2

    const-string v1, "allow_playstore"

    invoke-virtual {p1, v1, p2}, Lcom/digdroid/alman/dig/n;->m(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$b;->b:Lcom/digdroid/alman/dig/s3;

    iget-object p2, p1, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    sget-object v1, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/t3;->j:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/s3;->S(Z)V

    new-instance p1, Lcom/digdroid/alman/dig/q3$d;

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3$b;->h:Landroid/app/Activity;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3$b;->b:Lcom/digdroid/alman/dig/s3;

    invoke-direct {p1, p2, v1}, Lcom/digdroid/alman/dig/q3$d;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/s3;)V

    new-array p2, v0, [Ljava/lang/Void;

    invoke-virtual {p1, p2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
