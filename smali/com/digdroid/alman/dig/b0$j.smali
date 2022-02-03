.class Lcom/digdroid/alman/dig/b0$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/b0;->h(Lcom/digdroid/alman/dig/z3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/view/View;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/digdroid/alman/dig/z3;

.field final synthetic e:Landroid/content/Intent;

.field final synthetic f:Landroid/database/Cursor;

.field final synthetic g:Landroid/database/Cursor;

.field final synthetic h:Lcom/digdroid/alman/dig/b0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/b0;Landroid/view/View;Ljava/lang/String;Lcom/digdroid/alman/dig/z3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0$j;->h:Lcom/digdroid/alman/dig/b0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/b0$j;->b:Landroid/view/View;

    iput-object p3, p0, Lcom/digdroid/alman/dig/b0$j;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/digdroid/alman/dig/b0$j;->d:Lcom/digdroid/alman/dig/z3;

    iput-object p5, p0, Lcom/digdroid/alman/dig/b0$j;->e:Landroid/content/Intent;

    iput-object p6, p0, Lcom/digdroid/alman/dig/b0$j;->f:Landroid/database/Cursor;

    iput-object p7, p0, Lcom/digdroid/alman/dig/b0$j;->g:Landroid/database/Cursor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$j;->b:Landroid/view/View;

    const p2, 0x7f0902d8

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iget-object p2, p0, Lcom/digdroid/alman/dig/b0$j;->h:Lcom/digdroid/alman/dig/b0;

    invoke-static {p2}, Lcom/digdroid/alman/dig/b0;->b(Lcom/digdroid/alman/dig/b0;)Lcom/digdroid/alman/dig/c3;

    move-result-object p2

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$j;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    invoke-virtual {p2, v0, p1}, Lcom/digdroid/alman/dig/c3;->A(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0$j;->h:Lcom/digdroid/alman/dig/b0;

    iget-object v2, p0, Lcom/digdroid/alman/dig/b0$j;->d:Lcom/digdroid/alman/dig/z3;

    iget-object v3, p0, Lcom/digdroid/alman/dig/b0$j;->e:Landroid/content/Intent;

    iget-object v4, p0, Lcom/digdroid/alman/dig/b0$j;->f:Landroid/database/Cursor;

    iget-object v5, p0, Lcom/digdroid/alman/dig/b0$j;->g:Landroid/database/Cursor;

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/digdroid/alman/dig/b0;->r(Lcom/digdroid/alman/dig/z3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Z)V

    return-void
.end method
