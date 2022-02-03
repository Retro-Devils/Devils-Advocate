.class Lcom/digdroid/alman/dig/w2$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/w2;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/w2$b;

.field final synthetic b:Lcom/digdroid/alman/dig/w2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/w2;Lcom/digdroid/alman/dig/w2$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/w2$f;->b:Lcom/digdroid/alman/dig/w2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/w2$f;->a:Lcom/digdroid/alman/dig/w2$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/w2$f;->a:Lcom/digdroid/alman/dig/w2$b;

    iput-boolean p2, p1, Lcom/digdroid/alman/dig/w2$b;->d:Z

    return-void
.end method
