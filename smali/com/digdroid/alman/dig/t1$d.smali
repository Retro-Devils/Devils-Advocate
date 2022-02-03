.class Lcom/digdroid/alman/dig/t1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1;->n(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/app/Activity;

.field final synthetic d:Lcom/digdroid/alman/dig/p1;

.field final synthetic e:J

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lcom/digdroid/alman/dig/t1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1;Landroid/view/View;Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$d;->h:Lcom/digdroid/alman/dig/t1;

    iput-object p2, p0, Lcom/digdroid/alman/dig/t1$d;->b:Landroid/view/View;

    iput-object p3, p0, Lcom/digdroid/alman/dig/t1$d;->c:Landroid/app/Activity;

    iput-object p4, p0, Lcom/digdroid/alman/dig/t1$d;->d:Lcom/digdroid/alman/dig/p1;

    iput-wide p5, p0, Lcom/digdroid/alman/dig/t1$d;->e:J

    iput-object p7, p0, Lcom/digdroid/alman/dig/t1$d;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/digdroid/alman/dig/t1$d;->g:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$d;->b:Landroid/view/View;

    const p2, 0x7f0902d7

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1$d;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p2, p2, Lcom/digdroid/alman/dig/t1;->c:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    const-string v0, "inform_image_download"

    invoke-virtual {p2, v0, p1}, Lcom/digdroid/alman/dig/b3;->A(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$d;->h:Lcom/digdroid/alman/dig/t1;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t1$d;->c:Landroid/app/Activity;

    iget-object v3, p0, Lcom/digdroid/alman/dig/t1$d;->d:Lcom/digdroid/alman/dig/p1;

    iget-wide v4, p0, Lcom/digdroid/alman/dig/t1$d;->e:J

    iget-object v6, p0, Lcom/digdroid/alman/dig/t1$d;->f:Ljava/lang/String;

    iget-object v7, p0, Lcom/digdroid/alman/dig/t1$d;->g:Ljava/lang/String;

    invoke-virtual/range {v1 .. v7}, Lcom/digdroid/alman/dig/t1;->o(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
